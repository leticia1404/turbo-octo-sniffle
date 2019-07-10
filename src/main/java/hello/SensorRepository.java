package hello;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "sensor", path = "sensor")
public interface SensorRepository extends PagingAndSortingRepository<Sensor, Long> {

	Sensor findById(@Param("id") Integer id);

}