package my.nvinz.ds;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@Scope("prototype")
public class Project {
    private String name;
    private String owner;
    private String version;

    private Map<String, Field> fields;

}
