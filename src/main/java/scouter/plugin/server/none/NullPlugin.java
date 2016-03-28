package scouter.plugin.server.none;

import scouter.lang.pack.*;
import scouter.lang.plugin.PluginConstants;
import scouter.lang.plugin.annotation.ServerPlugin;
import scouter.server.Configure;

/**
 * @author Gun Lee (gunlee01@gmail.com) on 2016. 3. 19.
 */
public class NullPlugin {
    Configure conf = Configure.getInstance();

    @ServerPlugin(PluginConstants.PLUGIN_SERVER_ALERT)
    public void alert(AlertPack pack){
        if(conf.getBoolean("ext_plugin_null_alert_enabled", true)) {
            println("[NullPlugin-alert] " + pack);
        }
    }

    @ServerPlugin(PluginConstants.PLUGIN_SERVER_COUNTER)
    public void counter(PerfCounterPack pack){
        if(conf.getBoolean("ext_plugin_null_counter_enabled", true)) {
            println("[NullPlugin-counter] " + pack);
        }
    }

    @ServerPlugin(PluginConstants.PLUGIN_SERVER_OBJECT)
    public void object(ObjectPack pack){
        if(conf.getBoolean("ext_plugin_null_object_enabled", true)) {
            println("[NullPlugin-object] " + pack);
        }
    }

    @ServerPlugin(PluginConstants.PLUGIN_SERVER_SUMMARY)
    public void summary(SummaryPack pack){
        if(conf.getBoolean("ext_plugin_null_summary_enabled", true)) {
            println("[NullPlugin-summary] " + pack);
        }
    }

    @ServerPlugin(PluginConstants.PLUGIN_SERVER_XLOG)
    public void xlog(XLogPack pack){
        if(conf.getBoolean("ext_plugin_null_xlog_enabled", true)) {
            println("[NullPlugin-xlog] " + pack);
        }
    }

    @ServerPlugin(PluginConstants.PLUGIN_SERVER_PROFILE)
    public void profile(XLogProfilePack pack){
        if(conf.getBoolean("ext_plugin_null_profile_enabled", true)) {
            println("[NullPlugin-profile] " + pack);
        }
    }

    private void println(Object o) {
        if(conf.getBoolean("ext_plugin_null_debug", true)) { //default false normally, but true now for test purpose.
            System.out.println(o);
        }
    }
}
