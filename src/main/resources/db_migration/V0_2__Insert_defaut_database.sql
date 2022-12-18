insert into team (id, name) values (1, 'China');
insert into team (id, name) values (2, 'Portugal');
insert into team (id, name) values (3, 'Malaysia');
insert into team (id, name) values (4, 'Iran');
insert into team (id, name) values (5, 'Argentina');
alter sequence team_id_seq restart with 6;

insert into sponsor (id, name) values (1, 'Eimbee');
insert into sponsor (id, name) values (2, 'Fivebridge');
insert into sponsor (id, name) values (3, 'Buzzbean');
insert into sponsor (id, name) values (4, 'Demizz');
insert into sponsor (id, name) values (5, 'Thoughtworks');
alter sequence sponsor_id_seq restart with 6;

insert into player (id, name, number,team_entity_id) values (1, 'Calley Swale', 1, 1);
insert into player (id, name, number, team_entity_id) values (2, 'Molly Ingledew', 2, 2);
insert into player (id, name, number, team_entity_id) values (3, 'Hilary Lygo', 3, 3);
insert into player (id, name, number, team_entity_id) values (4, 'Carlynn Aimable', 4, 4);
insert into player (id, name, number,team_entity_id) values (5, 'Ezechiel Sedger', 5, 5);
alter sequence player_id_seq restart with 6;

insert into play_against (datetime, stadium, team_1_id, team_2_id) values ('2022/09/08', 'Camp Nou', 1, 3);
insert into play_against (datetime, stadium, team_1_id, team_2_id) values ('2022/04/20', 'Wembley Stadium', 1, 2);
insert into play_against (datetime, stadium, team_1_id, team_2_id) values ('2022/11/14', 'France Stadeium', 2, 1);
insert into play_against (datetime, stadium, team_1_id, team_2_id) values ('2022/08/14', 'Croke Park', 2, 4);
insert into play_against (datetime, stadium, team_1_id, team_2_id) values ('2022/09/18', 'Signal Iduna Park', 1, 3);

insert into have (sponsor_id, team_id) values (1, 1);
insert into have (sponsor_id, team_id) values (2, 2);
insert into have (sponsor_id, team_id) values (3, 3);
insert into have (sponsor_id, team_id) values (4, 4);
insert into have (sponsor_id, team_id) values (5, 5);