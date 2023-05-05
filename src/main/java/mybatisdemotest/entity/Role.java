package mybatisdemotest.entity;

import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * @version 1.0
 * @class: Role
 * @Description:
 * @Author: Dazo
 * @date: 5/5/2023
 */
public class Role {
    private Long id;
    private String name;
    private Set<Resource> resources;

    public Map<Object, Object> getResources() {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Role role = (Role) o;
        return Objects.equals(id, role.id) &&
                Objects.equals(name, role.name) &&
                Objects.equals(resources, role.resources);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, resources);
    }
}
