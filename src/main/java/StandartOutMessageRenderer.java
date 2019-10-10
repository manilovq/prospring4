public class StandartOutMessageRenderer implements MessageRenderer {
    private MessageProvider messageProvider;
    @Override
    public void render() {
        if (messageProvider == null) {
            throw new RuntimeException(
                    "You must set the property messageProvider of class:"
                    + StandartOutMessageRenderer.class.getName());
                    //вы должны установить свойство messageProvider класса
        }
        System.out.println(messageProvider.getMessage());
    }

    @Override
    public void setMessageProvider(MessageProvider provider) {
        this.messageProvider = provider;
    }

    @Override
    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }
}
