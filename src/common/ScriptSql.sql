/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  josec
 * Created: 4 ene. 2020
 */

-- Drop table

-- DROP TABLE public.contribuyentes;

CREATE TABLE public.contribuyentes (
	id serial NOT NULL,
	ruc varchar(50) NULL,
	dv int4 NULL,
	razon_social text NULL,
	tipo varchar(1) NULL,
	CONSTRAINT contribuyentes_pkey PRIMARY KEY (id)
);
CREATE INDEX contribuyentes_ruc_idx ON public.contribuyentes USING btree (ruc, dv, razon_social, tipo);

-- Permissions

ALTER TABLE public.contribuyentes OWNER TO postgres;
GRANT ALL ON TABLE public.contribuyentes TO postgres;
