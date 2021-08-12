package Api.demo;

import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
