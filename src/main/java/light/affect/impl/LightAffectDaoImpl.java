package light.affect.impl;

import light.affect.dao.LightAffectDao;
import light.affect.dto.Address;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

import java.util.List;

public class LightAffectDaoImpl implements LightAffectDao {

    private JdbcTemplate jdbcTemplate;

    public LightAffectDaoImpl(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }


    @Override
    public List<Address> getAddresses() {
        List<Address> addressList;
        String sql = "SELECT * FROM LIGHT_AFFECT.CONTACT ";
        addressList = jdbcTemplate.query(sql, (resultSet, i) -> {
            Address address = new Address();
            address.setId(resultSet.getInt(1));
            address.setPlaceName(resultSet.getString(2));
            address.setPhoneNumber(resultSet.getString(3));
            address.setAddress(resultSet.getString(4));

            return address;
        });


        return addressList;
    }
}
