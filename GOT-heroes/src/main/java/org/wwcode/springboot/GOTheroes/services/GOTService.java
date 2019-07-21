package org.wwcode.springboot.GOTheroes.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.wwcode.springboot.GOTheroes.models.GOTHero;

import java.util.ArrayList;
import java.util.List;

@Service
public class GOTService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<GOTHero> getAllHeroes() {

        String sql = "SELECT * FROM GOT_HEROES";

        List<GOTHero> heroes = new ArrayList<>();

        jdbcTemplate.query(sql, (resultSet) -> {
            GOTHero hero = new GOTHero();
            hero.setId(resultSet.getInt("HERO_ID"));
            hero.setName(resultSet.getString("HERO_NAME"));
            hero.setTitle(resultSet.getString("HERO_TITLE"));
            hero.setAllegiance(resultSet.getString("HERO_ALLEGIANCE"));
            hero.setImmageUrl(resultSet.getString("HERO_IMAGE_URL"));
            heroes.add(hero);
        });
        return heroes;
    }
}
