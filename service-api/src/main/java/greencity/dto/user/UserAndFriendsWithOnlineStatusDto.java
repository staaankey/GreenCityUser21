package greencity.dto.user;

import jakarta.validation.constraints.NotNull;
import lombok.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Builder
public class UserAndFriendsWithOnlineStatusDto {
    @NotNull
    private UserWithOnlineStatusDto user;

    @NotNull
    private List<UserWithOnlineStatusDto> friends;
}
