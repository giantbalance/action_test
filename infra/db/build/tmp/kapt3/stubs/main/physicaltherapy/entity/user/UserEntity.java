package physicaltherapy.entity.user;

@jakarta.persistence.Entity
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0011\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001e\u0010\u0002\u001a\u00020\u00038\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\b"}, d2 = {"Lphysicaltherapy/entity/user/UserEntity;", "Lphysicaltherapy/entity/BaseEntity;", "name", "", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "setName", "db"})
public class UserEntity extends physicaltherapy.entity.BaseEntity {
    @jakarta.persistence.Column(name = "name", nullable = false)
    @org.jetbrains.annotations.NotNull
    private java.lang.String name;
    
    public UserEntity(@org.jetbrains.annotations.NotNull
    java.lang.String name) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public java.lang.String getName() {
        return null;
    }
    
    public void setName(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
}