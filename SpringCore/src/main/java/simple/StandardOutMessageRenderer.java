package simple;

public class StandardOutMessageRenderer implements MessageRenderer {
	public MessageProvider messageProvider = null;

	@Override
	public void renderer() {
		// TODO Auto-generated method stub
		if (messageProvider == null) {
			throw new RuntimeException("You must set the property messageProvider of class:");
		}
	}

	@Override
	public void setMessageProvide(MessageProvider messageprovider) {
		// TODO Auto-generated method stub
		this.messageProvider = messageprovider;
	}

	@Override
	public MessageProvider getMessageProvider() {
		// TODO Auto-generated method stub
		return this.messageProvider;
	}

}
