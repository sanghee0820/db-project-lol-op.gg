package KNU.MainServer.global.domain;


import KNU.MainServer.global.type.TierType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "GAME_ACCOUNT")
public class GameAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long uniqueGameAccountId;
    private String gameName;
    private Integer accountLevel;
    @Enumerated(value = EnumType.STRING)
    private TierType tier;

    @OneToMany(mappedBy = "gameAccount", fetch = FetchType.LAZY)
    private List<Participant> participants;

    @Override
    public String toString() {
        return "GameAccount{" +
                "uniqueGameAccountId=" + uniqueGameAccountId +
                ", gameName='" + gameName + '\'' +
                ", accountLevel=" + accountLevel +
                ", tier=" + tier +
                "}\n";
    }
}