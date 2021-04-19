package hu.nive.ujratervezes.kepesitovizsga.frogprince;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

public class FrogPrince {

    public Set<PlayerOfTale> getPlayersOfTale(DataSource dataSource, Tale tale){
        Set<PlayerOfTale> playersOfTale = new HashSet<>();
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("SELECT player_name,age FROM `tales` WHERE `tale` = ?;")) {
            stmt.setString(1, tale.toString().toUpperCase() );


            return extracted(stmt, tale,playersOfTale );

        } catch (SQLException se) {
            throw new IllegalArgumentException("Error by select", se);
        }
    }

    private Set<PlayerOfTale> extracted(PreparedStatement stmt, Tale tale, Set<PlayerOfTale> playersOfTale) {
        try (ResultSet rs = stmt.executeQuery()) {
            playersOfTale = new HashSet<>();
            while (rs.next()) {
                String name = rs.getString("player_name");
                int age = rs.getInt("age");
                playersOfTale.add(new PlayerOfTale(name,age,tale));

            }
            return playersOfTale;


        } catch (SQLException se) {
            throw new IllegalStateException("Error by select", se);

        }
    }
}
