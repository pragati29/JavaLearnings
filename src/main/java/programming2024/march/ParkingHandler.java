package programming2024.march;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingHandler {

    List<String> space = new ArrayList<>(50);
    int hourFee = 20;
    Map<String, LocalDateTime> carEntryTime = new HashMap<>();

    public void entry(String carNumber) {
        LocalDateTime startTime;
        for (int i = 0; i < space.size(); i++) {
            if (space.get(i) == null) {
                space.add(carNumber);
                startTime = LocalDateTime.now();
                carEntryTime.put(carNumber, startTime);
                break;
            }
        }
    }

    public void exit(String carNumber) {
        LocalDateTime startTime = carEntryTime.get(carNumber);
        Duration duration = Duration.between(startTime, LocalDateTime.now());
        long totalHours = duration.toHours();
        long amount = totalHours * hourFee;
        space.remove(carNumber);
    }
}
