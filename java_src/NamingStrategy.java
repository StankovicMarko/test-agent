package Test;

import com.amazonaws.services.schemaregistry.common.AWSSchemaNamingStrategy;

public class NamingStrategy implements AWSSchemaNamingStrategy {

    @Override
    public String getSchemaName(String transportName) {
        // Your custom implementation
        // For example, modify the transportName or compute the schema name differently
        return transportName + "-value";
    }

}
