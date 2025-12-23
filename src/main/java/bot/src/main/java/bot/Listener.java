package bot;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Listener extends ListenerAdapter {

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        if (event.getAuthor().isBot()) return;

        String msg = event.getMessage().getContentRaw();
        if (!msg.startsWith("?")) return;

        if (msg.startsWith("?ping")) {
            event.getChannel().sendMessage("Bot online ✅").queue();
        }
    }
}
