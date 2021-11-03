package one.oktw;

import me.sargunvohra.mcmods.autoconfig1u.ConfigData;
import me.sargunvohra.mcmods.autoconfig1u.annotation.Config;

@SuppressWarnings({"FieldCanBeLocal", "FieldMayBeFinal"})
@Config(name = "FabricProxy")
public class ModConfig implements ConfigData {
    private Boolean BungeeCord = false;
    private Boolean allowBypassProxy = false;

    public Boolean getBungeeCord() {
        String env = System.getenv("FABRIC_PROXY_BUNGEECORD");
        if (env == null) {
            return BungeeCord;
        } else {
            return env.equalsIgnoreCase("true");
        }
    }

    public Boolean getAllowBypassProxy() {
        String env = System.getenv("FABRIC_PROXY_ALLOW_BYPASS_PROXY");
        if (env == null) {
            return allowBypassProxy;
        } else {
            return Boolean.valueOf(env);
        }
    }
}
