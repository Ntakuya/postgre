CREATE TABLE IF NOT EXISTS customer (
  customer_id UUID NOT NULL,
  store_id    SMALLINT NOT NULL,
  first_name  VARCHAR(255) NOT NULL,
  last_name   VARCHAR(255) NOT NULL,
  email       VARCHAR(255) NOT NULL,
  address_id  VARCHAR(255) NOT NULL,
  activebool  BOOLEAN NOT NULL,
  create_date date DEFAULT ('now'::text)::date NOT NULL,
  update_date date DEFAULT ('now'::text)::date NOT NULL,
  active      INTEGER
)
