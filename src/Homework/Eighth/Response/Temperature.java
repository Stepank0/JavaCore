
package Homework.Eighth.Response;



import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.*;


@JsonIgnoreProperties(ignoreUnknown = true)

public class Temperature {
    Metric MetricObject;

    @JsonCreator
    public Temperature(@JsonProperty("Metric") Metric MetricObject) {
        this.MetricObject = MetricObject;
    }

    @Override
    public String toString() {
        return "" + MetricObject;
    }

    // Getter Methods
    public Metric getMetric() {
        return MetricObject;
    }

    // Setter Methods
    public void setMetric(Metric MetricObject) {
        this.MetricObject = MetricObject;
    }
}
