import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import ru.urfu.MessageHandler;

public class MessageHandlerTest {

    MessageHandler messageHandler = new MessageHandler();

    @Test
    public void messageTest() {
        assertEquals("Ваше сообщение: 'привет'", messageHandler.getHandledMessage("привет"));
    }
}
