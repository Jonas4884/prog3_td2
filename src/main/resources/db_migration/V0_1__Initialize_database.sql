create table if not exists sponsor (
    id serial,
    name varchar,
    primary key(id)
);
create table if not exists team (
    id serial,
    name varchar,
    team_entity_id integer,
    sponsor_id integer,
    PRIMARY KEY(id),
    CONSTRAINT fk_sponsor_have_team FOREIGN KEY (sponsor_id) REFERENCES sponsor(id),
    CONSTRAINT fk_team_have FOREIGN KEY (team_entity_id) REFERENCES team(id)
);



create table if not exists player (
    id serial,
    name varchar,
    number integer unique,
    team_entity_id integer,
    primary key(id),
    constraint fk_team foreign key(team_entity_id) references team(id)
);

create table if not exists play_against (
    datetime timestamp,
    stadium varchar,
    team_1_id integer,
    team_2_id integer,
    constraint fk_team1 foreign key(team_1_id) references team(id),
    constraint fk_team2 foreign key(team_2_id) references team(id)
);

create table if not exists have (
    team_id integer,
    sponsor_id integer,
    constraint fk_team_have foreign key(team_id) references team(id),
    constraint fk_sponsor_have foreign key(sponsor_id) references sponsor(id)
);