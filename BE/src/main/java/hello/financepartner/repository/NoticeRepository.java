package hello.financepartner.repository;

import hello.financepartner.domain.Notice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NoticeRepository extends JpaRepository<Notice,Long> {
    List<Notice> findByFinancialLedger_Id(Long flId);
}
