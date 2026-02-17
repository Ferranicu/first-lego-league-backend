package cat.udl.eps.softarch.demo.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import cat.udl.eps.softarch.demo.domain.Venue;

@RepositoryRestResource
public interface VenueRepository extends CrudRepository<Venue, String>, PagingAndSortingRepository<Venue, String> {

	List<Venue> findAll();

}
