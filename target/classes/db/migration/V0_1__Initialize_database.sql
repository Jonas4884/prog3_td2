CREATE TABLE team
(
    id   serial primary key,
    name varchar(50) not null
);

CREATE TABLE team_play_against
(
    id serial primary key,
    datetime date not null,
    stadium varchar(50) not null,
    team_a_id int references team(id),
    team_b_id int references team(id)
);

CREATE TABLE player
(
    id serial primary key,
    name varchar(100) not null,
    number int not null,
     is_goal_keeper bool default false,
    team_id serial references team(id)
);

CREATE TABLE sponsor
(
    id serial primary key,
    name varchar(100) not null
);

CREATE TABLE team_have_sponsor
(
    team_id serial references team(id),
    sponsor_id serial references sponsor(id),
    PRIMARY KEY (team_id, sponsor_id)
);

CREATE TABLE goal (
    id serial primary key not null,
    match_id int references team_play_against(id)
);

CREATE TABLE player_score_goal (
    id serial primary key,
    player_id int references player(id),
    goal_id int references goal(id),
    scoring_time int not null,
    is_og bool
);