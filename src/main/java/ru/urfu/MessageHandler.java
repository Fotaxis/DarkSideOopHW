package ru.urfu;

/**
 * Обработчик сообщений
 */
public class MessageHandler {

    /**
     * Возвращает обработанное сообщение
     */
    public String getHandledMessage(String message) {
        return String.format("Ваше сообщение: '%s'", message);
    }
}

