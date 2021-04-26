--
-- PostgreSQL database dump
--

-- Dumped from database version 13.2
-- Dumped by pg_dump version 13.2

-- Started on 2021-04-26 13:29:29 -05


--
-- TOC entry 201 (class 1259 OID 16446)
-- Name: personas; Type: TABLE; Schema: public; Owner: usrprueba
--

CREATE TABLE public.personas (
    id bigint NOT NULL,
    primernombre character varying(80) NOT NULL,
    segundnombre character varying(80),
    primerapellido character varying(80) NOT NULL,
    segundoapellido character varying(80),
    celular bigint NOT NULL,
    email character varying(100) NOT NULL
);


ALTER TABLE public.personas OWNER TO usrprueba;

--
-- TOC entry 200 (class 1259 OID 16444)
-- Name: personas_id_seq; Type: SEQUENCE; Schema: public; Owner: usrprueba
--

CREATE SEQUENCE public.personas_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.personas_id_seq OWNER TO usrprueba;

--
-- TOC entry 3255 (class 0 OID 0)
-- Dependencies: 200
-- Name: personas_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: usrprueba
--

ALTER SEQUENCE public.personas_id_seq OWNED BY public.personas.id;


--
-- TOC entry 3115 (class 2604 OID 16449)
-- Name: personas id; Type: DEFAULT; Schema: public; Owner: usrprueba
--

ALTER TABLE ONLY public.personas ALTER COLUMN id SET DEFAULT nextval('public.personas_id_seq'::regclass);


--
-- TOC entry 3249 (class 0 OID 16446)
-- Dependencies: 201
-- Data for Name: personas; Type: TABLE DATA; Schema: public; Owner: usrprueba
--

INSERT INTO public.personas (id, primernombre, segundnombre, primerapellido, segundoapellido, celular, email) VALUES (1, 'andres', NULL, 'castellanos', NULL, 3126454393, 'andrescastellanosdocente@gmail.com');
INSERT INTO public.personas (id, primernombre, segundnombre, primerapellido, segundoapellido, celular, email) VALUES (4, 'martha
', NULL, 'galindo', NULL, 3105054142, 'marthagalindo@gmail.com');
INSERT INTO public.personas (id, primernombre, segundnombre, primerapellido, segundoapellido, celular, email) VALUES (5, 'manuel', NULL, 'castellanos', NULL, 3104587412, 'manuelcastellanos@gmail.com');


--
-- TOC entry 3256 (class 0 OID 0)
-- Dependencies: 200
-- Name: personas_id_seq; Type: SEQUENCE SET; Schema: public; Owner: usrprueba
--

SELECT pg_catalog.setval('public.personas_id_seq', 5, true);


--
-- TOC entry 3117 (class 2606 OID 16451)
-- Name: personas personas_pkey; Type: CONSTRAINT; Schema: public; Owner: usrprueba
--

ALTER TABLE ONLY public.personas
    ADD CONSTRAINT personas_pkey PRIMARY KEY (id);


-- Completed on 2021-04-26 13:29:29 -05

--
-- PostgreSQL database dump complete
--

