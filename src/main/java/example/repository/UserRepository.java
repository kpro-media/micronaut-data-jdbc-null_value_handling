package example.repository;

import example.entity.User;
import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.jdbc.runtime.JdbcOperations;
import io.micronaut.data.model.query.builder.sql.Dialect;
import io.micronaut.data.repository.CrudRepository;

import javax.transaction.Transactional;

@JdbcRepository(dialect = Dialect.MYSQL)
public abstract class UserRepository implements CrudRepository<User, Long> {
    JdbcOperations jdbcOperations;

    public UserRepository(JdbcOperations jdbcOperations) {
        this.jdbcOperations = jdbcOperations;
    }

    @Transactional
    public abstract User findUserById(Long id);
}
