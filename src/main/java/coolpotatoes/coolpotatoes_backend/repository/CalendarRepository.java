package coolpotatoes.coolpotatoes_backend.repository;

import coolpotatoes.coolpotatoes_backend.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

import java.util.Calendar;
import java.util.List;
import java.util.Optional;

//@Repository
//public interface CalendarRepository extends JpaRepository<Calendar,Long> {
//    boolean existsByMemberAndDay(Member member, LocalDate day);
//    List<Calendar> findAllByUserUserId(Long userId);
//    List<Calendar> findAllByDayAndUserUserId(LocalDate day,Long userId);
//
//    Optional<Calendar> findByDayAndUserUserId(LocalDate day, Long userId);
//}
