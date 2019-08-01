package simple;

public interface MessageRenderer {
	void renderer();

	void setMessageProvide(MessageProvider messageprovider);

	MessageProvider getMessageProvider();
}
