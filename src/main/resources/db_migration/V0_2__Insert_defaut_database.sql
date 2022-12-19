insert into team (id, name) values (1, 'Japan');
insert into team (id, name) values (2, 'Madagascar');
insert into team (id, name) values (3, 'Chile');
insert into team (id, name) values (4, 'Pakistan');
insert into team (id, name) values (5, 'France');
alter sequence team_id_seq restart with 6;

insert into sponsor (id, name) values (1, 'Coca cola');
insert into sponsor (id, name) values (2, 'Volo');
insert into sponsor (id, name) values (3, 'Actros');
insert into sponsor (id, name) values (4, 'Toyota');
insert into sponsor (id, name) values (5, 'Pepsi');
alter sequence sponsor_id_seq restart with 6;

insert into player (id, name, number,team_entity_id) values (1, 'Gareth Bale',12 , 1);
insert into player (id, name, number, team_entity_id) values (2, 'Modric', 10, 2);
insert into player (id, name, number, team_entity_id) values (3, 'lionnel messi', 20, 3);
insert into player (id, name, number, team_entity_id) values (4, 'Steph Curry', 30, 4);
insert into player (id, name, number,team_entity_id) values (5, 'Jorghino', 52, 5);
alter sequence player_id_seq restart with 6;

insert into play_against (id,datetime, stadium, team_1_id, team_2_id) values (1,'2022/01/12 02:20:25', 'LSLS Stadium', 1, 3);
insert into play_against (id,datetime, stadium, team_1_id, team_2_id) values (2,'2022/02/05 20:25:20', 'Frankfurt Stadium', 1, 2);
insert into play_against (id,datetime, stadium, team_1_id, team_2_id) values (3,'2022/10/10 20:25:20', 'Iran Park', 2, 1);
insert into play_against (id,datetime, stadium, team_1_id, team_2_id) values (4,'2022/02/14 20:25:20', 'Switzerland park', 2, 4);
insert into play_against (id,datetime, stadium, team_1_id, team_2_id) values (5,'2022/10/18 20:25:20', 'Mumbai Stadium', 1, 3);

insert into have (sponsor_id, team_id) values (1, 1);
insert into have (sponsor_id, team_id) values (1, 2);
insert into have (sponsor_id, team_id) values (1, 5);
insert into have (sponsor_id, team_id) values (1, 3);
insert into have (sponsor_id, team_id) values (2, 1);
insert into have (sponsor_id, team_id) values (2, 2);
insert into have (sponsor_id, team_id) values (2, 3);
insert into have (sponsor_id, team_id) values (3, 1);
insert into have (sponsor_id, team_id) values (3, 5);
insert into have (sponsor_id, team_id) values (3, 3);
insert into have (sponsor_id, team_id) values (4, 4);
insert into have (sponsor_id, team_id) values (4, 1);
insert into have (sponsor_id, team_id) values (4, 2);
insert into have (sponsor_id, team_id) values (5, 5);
insert into have (sponsor_id, team_id) values (5, 1);
insert into have (sponsor_id, team_id) values (5, 3);
insert into have (sponsor_id, team_id) values (5, 2);