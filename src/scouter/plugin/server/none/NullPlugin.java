package scouter.plugin.server.none;

import scouter.lang.pack.*;
import scouter.lang.plugin.PluginConstants;
import scouter.lang.plugin.annotation.ServerPlugin;

/**
 * @author Gun Lee (gunlee01@gmail.com) on 2016. 3. 19.
 */
public class NullPlugin {
    private boolean debug = System.getProperty("scouter.plugin.server.null.debug", "f").equals("true") ? true : false;

    @ServerPlugin(PluginConstants.PLUGIN_SERVER_ALERT)
    public void alert(AlertPack pack){
        println("[NullPlugin-alert] " + pack);
    }

    @ServerPlugin(PluginConstants.PLUGIN_SERVER_COUNTER)
    public void counter(PerfCounterPack pack){
        println("[NullPlugin-counter] " + pack);
    }

    @ServerPlugin(PluginConstants.PLUGIN_SERVER_OBJECT)
    public void object(ObjectPack pack){
        println("[NullPlugin-object] " + pack);
    }

    @ServerPlugin(PluginConstants.PLUGIN_SERVER_PROFILE)
    public void profile(XLogProfilePack pack){
        println("[NullPlugin-profile] " + pack);
    }

    @ServerPlugin(PluginConstants.PLUGIN_SERVER_SUMMARY)
    public void summary(SummaryPack pack){
        println("[NullPlugin-summary] " + pack);
    }

    @ServerPlugin(PluginConstants.PLUGIN_SERVER_XLOG)
    public void xlog(XLogPack pack){
        println("[NullPlugin-xlog] " + pack);
    }

    private void println(Object o) {
        debug = true;
        if(debug) {
            System.out.println(o);
        }
    }
}
