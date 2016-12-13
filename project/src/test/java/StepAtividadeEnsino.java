import com.github.tomakehurst.wiremock.junit.WireMockRule;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import wiremock.org.apache.http.client.methods.CloseableHttpResponse;
import wiremock.org.apache.http.client.methods.HttpGet;
import wiremock.org.apache.http.client.utils.URIBuilder;
import wiremock.org.apache.http.impl.client.CloseableHttpClient;
import wiremock.org.apache.http.impl.client.HttpClients;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;

public class StepAtividadeEnsino {

    private int cargaHorariaGraduacaoPresencial;
    private int cargaHorariaGraduacaoADistancia;
    private int pontuacaoAulasPresenciaisGraduacao;
    private int pontuacaoAulasADistanciaGraduacao;

    private int pontuacaoGraduacao;

    private int cargaHorariaPosGraduacaoPresencial;
    private int cargaHorariaPosGraduacaoADistancia;
    private int pontuacaoAulasPresenciaisPosGraduacao;
    private int pontuacaoAulasADistanciaPosGraduacao;

    private int pontuacaoPosGraduacao;

    @Rule
    public WireMockRule wireMockRule = new WireMockRule(8089);

    @Before
    @Step("Inicializar Servico.")
    public void init() {
        new StubRequisicoesSaepResolucao().inicializarStubGet();
        new StubRequisicoesSaepResolucao().inicializarStubPost();
        new StubRequisicoesSaepResolucao().inicializarStubDelete();
    }

    @Step("Carga horaria graduacao aulas presenciais <chag>.")
    public void setCargaGraduacaoPresencial(int chag) {
        cargaHorariaGraduacaoPresencial = chag;
    }

    @Step("Calcular pontuacao em aulas presenciais graducao")
    public void calcularPontuacaoAulasPrsenciaisGraduacao() {

        URI uri;
        try {
            uri = new URIBuilder()
                    .setScheme("http")
                    .setHost("localhost:8089//saep/resolucao/1")
                    .build();

            HttpGet result = new HttpGet(uri);
            CloseableHttpClient httpclient = HttpClients.createDefault();
            CloseableHttpResponse response = httpclient.execute(result);
            InputStream content = response.getEntity().getContent();

            String json = new Utilitarios().converterInputStreamParaJson(content);
            boolean resp = json != null;

            pontuacaoAulasPresenciaisGraduacao = (10 * cargaHorariaGraduacaoPresencial) / 32;
            Assert.assertTrue(resp && (62 == pontuacaoAulasPresenciaisGraduacao));

        } catch (URISyntaxException | IOException e) {
            e.printStackTrace();
        }
    }

    @Step("Carga horaria graduacao aulas a distancia <chaeadg>.")
    public void setCargaHorariaGraduacaoADistancia(int chaeadg) {
        cargaHorariaGraduacaoADistancia = chaeadg;
    }

    @Step("Calcular pontuacao em aulas a distancia graduacao")
    public void calcularPontuacaoAulasADistanciaGraduacao() {

        URI uri;
        try {
            uri = new URIBuilder()
                    .setScheme("http")
                    .setHost("localhost:8089//saep/resolucao/1")
                    .build();

            HttpGet result = new HttpGet(uri);
            CloseableHttpClient httpclient = HttpClients.createDefault();
            CloseableHttpResponse response = httpclient.execute(result);
            InputStream content = response.getEntity().getContent();

            String json = new Utilitarios().converterInputStreamParaJson(content);
            boolean resp = json != null;

            pontuacaoAulasADistanciaGraduacao = (10 * cargaHorariaGraduacaoADistancia) / 32;
            Assert.assertTrue(resp && (31 == pontuacaoAulasADistanciaGraduacao));

        } catch (URISyntaxException | IOException e) {
            e.printStackTrace();
        }
    }

    @Step("Calcular pontuacao graduacao.")
    public void calcularPontuacaoGraduacaoPresencial() {

        URI uri;
        try {
            uri = new URIBuilder()
                    .setScheme("http")
                    .setHost("localhost:8089//saep/resolucao/1")
                    .build();

            HttpGet result = new HttpGet(uri);
            CloseableHttpClient httpclient = HttpClients.createDefault();
            CloseableHttpResponse response = httpclient.execute(result);
            InputStream content = response.getEntity().getContent();

            String json = new Utilitarios().converterInputStreamParaJson(content);
            boolean resp = json != null;

            pontuacaoGraduacao = pontuacaoAulasPresenciaisGraduacao + pontuacaoAulasADistanciaGraduacao;
            Assert.assertTrue(resp && ((pontuacaoAulasPresenciaisGraduacao + pontuacaoAulasADistanciaGraduacao) == pontuacaoGraduacao));

        } catch (URISyntaxException | IOException e) {
            e.printStackTrace();
        }
    }

    @Step("Carga horaria pos-graduacao aulas presenciais <chapg>.")
    public void setCargaHorariaPosGraduacaoPresencial(int chapg) {
        cargaHorariaPosGraduacaoPresencial = chapg;
    }

    @Step("Carga horaria pos-graduacao aulas a distancia <chaeadpg>.")
    public void setCargaHorariaPosGraduacaoADistancia(int chaeadpg) {
        cargaHorariaPosGraduacaoADistancia = chaeadpg;
    }


    @Step("Calcular pontuacao em aulas presenciais pos-graducao.")
    public void calcularPontuacaoPresencialPosGraduacaoo() {
        URI uri;
        try {
            uri = new URIBuilder()
                    .setScheme("http")
                    .setHost("localhost:8089//saep/resolucao/1")
                    .build();

            HttpGet result = new HttpGet(uri);
            CloseableHttpClient httpclient = HttpClients.createDefault();
            CloseableHttpResponse response = httpclient.execute(result);
            InputStream content = response.getEntity().getContent();

            String json = new Utilitarios().converterInputStreamParaJson(content);
            boolean resp = json != null;

            pontuacaoAulasPresenciaisPosGraduacao = (10 * cargaHorariaPosGraduacaoPresencial) / 32;
            Assert.assertTrue(resp && (((10 * cargaHorariaPosGraduacaoPresencial) / 32) == pontuacaoAulasPresenciaisPosGraduacao));

        } catch (URISyntaxException | IOException e) {
            e.printStackTrace();
        }
    }

    @Step("Calcular pontuação em aulas a distancia pos-graduacao.")
    public void calcularPontuacaoADistanciaPosGraduacao() {
        URI uri;
        try {
            uri = new URIBuilder()
                    .setScheme("http")
                    .setHost("localhost:8089//saep/resolucao/1")
                    .build();

            HttpGet result = new HttpGet(uri);
            CloseableHttpClient httpclient = HttpClients.createDefault();
            CloseableHttpResponse response = httpclient.execute(result);
            InputStream content = response.getEntity().getContent();

            String json = new Utilitarios().converterInputStreamParaJson(content);
            boolean resp = json != null;

            pontuacaoAulasADistanciaPosGraduacao = (10 * cargaHorariaPosGraduacaoADistancia) / 32;
            Assert.assertEquals(((10 * cargaHorariaPosGraduacaoADistancia) / 32), pontuacaoAulasADistanciaPosGraduacao);

        } catch (URISyntaxException | IOException e) {
            e.printStackTrace();
        }
    }

    @Step("Calcular pontuacao pos-graduacao.")
    public void calcularPontuacaoPosGraduacao() {
        URI uri;
        try {
            uri = new URIBuilder()
                    .setScheme("http")
                    .setHost("localhost:8089//saep/resolucao/1")
                    .build();

            HttpGet result = new HttpGet(uri);
            CloseableHttpClient httpclient = HttpClients.createDefault();
            CloseableHttpResponse response = httpclient.execute(result);
            InputStream content = response.getEntity().getContent();

            String json = new Utilitarios().converterInputStreamParaJson(content);
            boolean resp = json != null;

            pontuacaoPosGraduacao = pontuacaoAulasPresenciaisPosGraduacao + pontuacaoAulasADistanciaPosGraduacao;
            Assert.assertEquals((pontuacaoAulasPresenciaisPosGraduacao + pontuacaoAulasADistanciaPosGraduacao), pontuacaoPosGraduacao);

        } catch (URISyntaxException | IOException e) {
            e.printStackTrace();
        }
    }

    @Step("Calcular pontuacao atividade de ensino.")
    public void calcularPontuacaoGraduacao() {
        URI uri;
        try {
            uri = new URIBuilder()
                    .setScheme("http")
                    .setHost("localhost:8089//saep/resolucao/1")
                    .build();

            HttpGet result = new HttpGet(uri);
            CloseableHttpClient httpclient = HttpClients.createDefault();
            CloseableHttpResponse response = httpclient.execute(result);
            InputStream content = response.getEntity().getContent();

            String json = new Utilitarios().converterInputStreamParaJson(content);
            boolean resp = json != null;

            pontuacaoGraduacao = (pontuacaoAulasPresenciaisGraduacao + pontuacaoAulasADistanciaGraduacao);
            Assert.assertTrue(resp && ((pontuacaoAulasPresenciaisGraduacao + pontuacaoAulasADistanciaGraduacao) == pontuacaoGraduacao));

        } catch (URISyntaxException | IOException e) {
            e.printStackTrace();
        }
    }
}