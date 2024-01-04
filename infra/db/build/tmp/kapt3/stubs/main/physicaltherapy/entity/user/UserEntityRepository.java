package physicaltherapy.entity.user;

@org.springframework.stereotype.Repository
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0011\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lphysicaltherapy/entity/user/UserEntityRepository;", "Lphysicaltherapy/user/UserRepository;", "userJpaRepository", "Lphysicaltherapy/entity/user/UserJpaRepository;", "(Lphysicaltherapy/entity/user/UserJpaRepository;)V", "add", "", "name", "", "read", "Lphysicaltherapy/user/User;", "id", "db"})
public class UserEntityRepository implements physicaltherapy.user.UserRepository {
    @org.jetbrains.annotations.NotNull
    private final physicaltherapy.entity.user.UserJpaRepository userJpaRepository = null;
    
    public UserEntityRepository(@org.jetbrains.annotations.NotNull
    physicaltherapy.entity.user.UserJpaRepository userJpaRepository) {
        super();
    }
    
    @java.lang.Override
    public long add(@org.jetbrains.annotations.NotNull
    java.lang.String name) {
        return 0L;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public physicaltherapy.user.User read(long id) {
        return null;
    }
}