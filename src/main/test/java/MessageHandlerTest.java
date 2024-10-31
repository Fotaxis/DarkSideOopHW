import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import ru.urfu.MessageHandler;

/**
 * Класс для теста MessageHandler
 */
public class MessageHandlerTest {

    MessageHandler messageHandler = new MessageHandler();

    /**
     * Тест работы метода для получения ответного сообщения
     */
    @Test
    public void messageTest() {
        assertEquals("Ваше сообщение: 'привет'", messageHandler.getHandledMessage("привет"));
    }
}
