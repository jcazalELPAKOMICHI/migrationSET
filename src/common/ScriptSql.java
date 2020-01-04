/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

/**
 *
 * @author josec
 */
public class ScriptSql {

    public static final String CREATE_TABLE = ""
            + "-- Drop table\n"
            + "\n"
            + "-- DROP TABLE public.contribuyentes;\n"
            + "\n"
            + "CREATE TABLE public.contribuyentes (\n"
            + "	id serial NOT NULL,\n"
            + "	ruc varchar(50) NULL,\n"
            + "	dv int4 NULL,\n"
            + "	razon_social text NULL,\n"
            + "	tipo varchar(1) NULL,\n"
            + "	CONSTRAINT contribuyentes_pkey PRIMARY KEY (id),\n"
            + "	CONSTRAINT contribuyentes_un UNIQUE (ruc)\n"
            + ");\n"
            + "CREATE INDEX contribuyentes_ruc_idx ON public.contribuyentes USING btree (ruc, dv, razon_social, tipo);\n"
            + "\n"
            + "-- Permissions\n"
            + "\n"
            + "ALTER TABLE public.contribuyentes OWNER TO postgres;\n"
            + "GRANT ALL ON TABLE public.contribuyentes TO postgres;";

    public static final String ISEXXIST = "SELECT EXISTS (\n"
            + "   SELECT 1\n"
            + "   FROM   information_schema.tables \n"
            + "   WHERE  table_schema = 'public'\n"
            + "   AND    table_name = 'contribuyentes'\n"
            + "   );";

    public static final String INSERT_DATA = "  INSERT INTO contribuyentes\n"
            + "(ruc, dv, razon_social, tipo)\n"
            + "VALUES(?,?,?,?)\n"
            + "on conflict (ruc) do update set \n"
            + "dv = excluded.dv,\n"
            + "razon_social = excluded.razon_social,\n"
            + "tipo = excluded.tipo;";

}
