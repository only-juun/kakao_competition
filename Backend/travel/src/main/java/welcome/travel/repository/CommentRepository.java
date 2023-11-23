package welcome.travel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import welcome.travel.domain.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
}
