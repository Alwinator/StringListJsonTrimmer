package at.alwinschuster;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.json.PackageVersion;
import com.fasterxml.jackson.databind.Module;

public class MyModule extends Module{
    private final String NAME = "MyModule";

    @Override
    public String getModuleName() {
        return NAME;
    }

    @Override
    public Version version() {
        return PackageVersion.VERSION;
    }

    @Override
    public void setupModule(SetupContext setupContext) {
        setupContext.addDeserializers(new MyModuleDeserializers());
    }
}
