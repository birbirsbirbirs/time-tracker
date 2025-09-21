* tacker
```shell
create table tracker
(
    start_time      timestamp(6),
    stop_time       timestamp(6),
    id              uuid not null
        primary key,
    tracker_user_id uuid
        constraint fkp79w9ksstw2k2yj1hrq0b358p
            references ??? (),
    action          varchar(255),
    remarks         varchar(255)
);

alter table tracker
    owner to myuser;
```

* tracker_user
```shell
create table tracker_user
(
    id         uuid not null
        primary key,
    email      varchar(255),
    first_name varchar(255),
    last_name  varchar(255)
);

alter table tracker_user
    owner to myuser;

```