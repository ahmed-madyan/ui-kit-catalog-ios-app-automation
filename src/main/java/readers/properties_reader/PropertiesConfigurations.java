package readers.properties_reader;

public class PropertiesConfigurations {
    private static String execution_Platform;
    private static String targetRemoteExecution;

    public static void setConfigProperties() {
        setExecution_Platform(PropertiesDataManager.getProperty("executionPlatform", PropertiesDataManager.Capability.EXECUTION));
        setTargetRemoteExecution(PropertiesDataManager.getProperty("targetRemoteExecution", PropertiesDataManager.Capability.EXECUTION));
    }

    public static String getCapability(String capability, String filePath) {
        return PropertiesDataManager.getProperty(capability, filePath);
    }

    public static String getExecution_Platform() {
        return execution_Platform;
    }

    public static void setExecution_Platform(String execution_Platform) {
        PropertiesConfigurations.execution_Platform = execution_Platform;
    }

    public static String getTargetRemoteExecution() {
        return targetRemoteExecution;
    }

    public static void setTargetRemoteExecution(String targetRemoteExecution) {
        PropertiesConfigurations.targetRemoteExecution = targetRemoteExecution;
    }
}