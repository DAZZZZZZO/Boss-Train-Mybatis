package mybatisdemotest.dao.mapper;

import com.example.model.UserExample;
import mybatisdemotest.entity.User;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @version 1.0
 * @class: UserMapperImpl
 * @Description:
 * @Author: Dazo
 * @date: 5/5/2023
 */
public abstract class UserMapperImpl implements UserMapper {
    @Override
    public User selectUserById(Long id) {
        return null;
    }

    @Override
    public List<User> selectByExample(UserExample example) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public Object get(Object key) {
        return null;
    }

    @Override
    public Object remove(Object key) {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public Set<User> keySet() {
        return null;
    }

    @Override
    public Collection values() {
        return null;
    }

    @Override
    public Set<Entry> entrySet() {
        return null;
    }

    @Override
    public Object getOrDefault(Object key, Object defaultValue) {
        return null;
    }

    @Override
    public boolean remove(Object key, Object value) {
        return false;
    }



    @Override
    public void replaceAll(BiFunction function) {

    }

    @Override
    public void forEach(BiConsumer action) {

    }

    @Override
    public void putAll(Map m) {

    }

}
