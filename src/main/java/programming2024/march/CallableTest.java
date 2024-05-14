package programming2024.march;

import java.util.concurrent.Callable;

public class CallableTest implements Callable {
    @Override
    public Object call() throws Exception {
        return "Pragati";
    }
}
