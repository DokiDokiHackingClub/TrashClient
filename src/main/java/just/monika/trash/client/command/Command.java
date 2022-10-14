package just.monika.trash.client.command;

import just.monika.trash.client.Client;

public interface Command {

	Client client = Client.getClient();

	boolean run(String[] args);

	String usage();

}
