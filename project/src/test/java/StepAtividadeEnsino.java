import com.thoughtworks.gauge.Step;
import org.junit.Assert;

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

    @Step("Carga horaria graduacao aulas presenciais <chag>.")
    public void setCargaGraduacaoPresencial(int chag) {
        cargaHorariaGraduacaoPresencial = chag;
    }

    @Step("Calcular pontuacao em aulas presenciais graducao")
    public void calcularPontuacaoAulasPrsenciaisGraduacao() {
        pontuacaoAulasPresenciaisGraduacao = (10 * cargaHorariaGraduacaoPresencial) / 32;
        Assert.assertEquals(62, pontuacaoAulasPresenciaisGraduacao);
    }

    @Step("Carga horaria graduacao aulas a distancia <chaeadg>.")
    public void setCargaHorariaGraduacaoADistancia(int chaeadg) {
        cargaHorariaGraduacaoADistancia = chaeadg;
    }

    @Step("Calcular pontuacao em aulas a distancia graduacao")
    public void calcularPontuacaoAulasADistanciaGraduacao() {
        pontuacaoAulasADistanciaGraduacao = (10 * cargaHorariaGraduacaoADistancia) / 32;
        Assert.assertEquals(31, pontuacaoAulasADistanciaGraduacao);
    }

    @Step("Executar requisicao de <comando> usado metodo <metodo> para id <id> resultado e <resultado>")
    public void calcularPontuacaoGraduacaoPresencial() {
        Usar parametros para montar os parametros a serem empregados pelo metodo que, de fato faz a requisicao http.
        pontuacaoGraduacao = pontuacaoAulasPresenciaisGraduacao + pontuacaoAulasADistanciaGraduacao;
        Assert.assertEquals((pontuacaoAulasPresenciaisGraduacao + pontuacaoAulasADistanciaGraduacao), pontuacaoGraduacao);
    }

    @Step("Carga horaria pos-graduacao aulas presenciais <chapg>.")
    public void setCargaHorariaPosGraduacaoPresencial(int chapg) {
        cargaHorariaPosGraduacaoPresencial = chapg;
    }

    @Step("Car ga horaria pos-graduacao aulas a distancia <chaeadpg>.")
    public void setCargaHorariaPosGraduacaoADistancia(int chaeadpg) {
        cargaHorariaPosGraduacaoADistancia = chaeadpg;
    }


    @Step("Calcular pontuacao em aulas presenciais pos-graducao.")
    public void calcularPontuacaoPresencialPosGraduacaoo() {
        pontuacaoAulasPresenciaisPosGraduacao = (10 * cargaHorariaPosGraduacaoPresencial) / 32;
        Assert.assertEquals(((10 * cargaHorariaPosGraduacaoPresencial) / 32), pontuacaoAulasPresenciaisPosGraduacao);
    }

    @Step("Calcular pontuação em aulas a distancia pos-graduacao.")
    public void calcularPontuacaoADistanciaPosGraduacao() {
        pontuacaoAulasADistanciaPosGraduacao = (10 * cargaHorariaPosGraduacaoADistancia) / 32;
        Assert.assertEquals(((10 * cargaHorariaPosGraduacaoADistancia) / 32), pontuacaoAulasADistanciaPosGraduacao);
    }

    @Step("Calcular pontuacao pos-graduacao.")
    public void calcularPontuacaoPosGraduacao() {
        pontuacaoPosGraduacao = pontuacaoAulasPresenciaisPosGraduacao + pontuacaoAulasADistanciaPosGraduacao;
        Assert.assertEquals((pontuacaoAulasPresenciaisPosGraduacao + pontuacaoAulasADistanciaPosGraduacao), pontuacaoPosGraduacao);
    }

    @Step("Calcular pontuacao atividade de ensino.")
    public void calcularPontuacaoGraduacao() {
        pontuacaoGraduacao = (pontuacaoAulasPresenciaisGraduacao + pontuacaoAulasADistanciaGraduacao);
        Assert.assertEquals((pontuacaoAulasPresenciaisGraduacao + pontuacaoAulasADistanciaGraduacao), pontuacaoGraduacao);
    }
}