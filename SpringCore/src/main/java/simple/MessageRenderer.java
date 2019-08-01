package simple;

public interface MessageRenderer {
	void renderer();

	void setMessageProvider(MessageProvider messageprovider);

	MessageProvider getMessageProvider();
}
