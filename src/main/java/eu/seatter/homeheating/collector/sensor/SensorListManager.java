package eu.seatter.homeheating.collector.sensor;

import eu.seatter.homeheating.collector.model.SensorRecord;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: jas
 * Date: 29/01/2019
 * Time: 12:34
 */
public interface SensorListManager {
    List<SensorRecord> getSensors();
}
