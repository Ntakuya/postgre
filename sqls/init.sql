CREATE TABLE IF NOT EXISTS category
(
  category_id UUID NOT NULL,
  name        VARCHAR(256) NOT NULL,
  last_update TIMESTAMPTZ NOT NULL,
  PRIMARY KEY (category_id)
);


CREATE TABLE IF NOT EXISTS film_category
(
  film_id UUID NOT NULL,
  category_id UUID,
  last_updated TIMESTAMPTZ,
  PRIMARY KEY(film_id),
  CONSTRAINT fk_customer
    FOREIGN KEY(category_id)
      REFERENCES category(category_id)
);

--
--
--

CREATE TABLE IF NOT EXISTS public.customer
(
  customer_id UUID NOT NULL,
  store_id UUID NOT NULL,
  first_name varchar(255) NOT NULL,
  last_name  varchar(255) NOT NULL,
  email varchar(255) NOT NULL,
  address_id smallint NOT NULL,
  activebool boolean DEFAULT true NOT NULL,
  create_date date DEFAULT ('now'::text)::date NOT NULL,
  last_update timestamp without time zone DEFAULT now(),
  active integer
);
