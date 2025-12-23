package bot;

import net.dv8tion.jda.api.*;
import net.dv8tion.jda.api.requests.GatewayIntent;

public class Main {
    public static void main(String[] args) throws Exception {
        JDABuilder.createDefault(System.getenv("DISCORD_TOKEN"),
                GatewayIntent.GUILD_MESSAGES,
                GatewayIntent.MESSAGE_CONTENT,
                GatewayIntent.GUILD_VOICE_STATES,
                GatewayIntent.GUILD_MEMBERS)
            .addEventListeners(new Listener())
            .build();
    }
}
