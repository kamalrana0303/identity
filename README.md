### Get started
  - docker run --name postgres -e POSTGRES_PASSWORD=mangalsathi_password -e POSTGRES_DB=mangalsathi_db -e POSTGRES_USER=mangalsathi_user -p 5432:5432 -d postgres:18.1-alpine3.22
  - docker exec -it postgres psql -U mangalsathi_user -d mangalsathi_db
  - show tables : \dt