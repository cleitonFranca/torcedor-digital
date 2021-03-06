package servidor.torcedor.digital.models;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Cascade;

@Entity(name="ingressos")
public class Ingresso implements Serializable {

	private static final long serialVersionUID = 1612359462992212627L;
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@NotNull
	@Column(name="id_usuario")
	private Long idUsuario;
	@NotNull
	@Column(name="item_transacao")
	private String itemTransacao;
	@NotNull
	@Column(name="id_jogo")
	private Long idJogo;
	@Column(name="data_inicio")
	private Timestamp dataInicio;
	@Column(name="data_fim")
	private Timestamp dataFim;
	
	private String url;
	
	private boolean status;
	
	@OneToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name="id_jogo", referencedColumnName="id", insertable=false, updatable=false)
	private Calendario jogo;

	
	public Calendario getJogo() {
		return jogo;
	}

	public void setJogo(Calendario jogo) {
		this.jogo = jogo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Timestamp getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Timestamp dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Timestamp getDataFim() {
		return dataFim;
	}

	public void setDataFim(Timestamp dataFim) {
		this.dataFim = dataFim;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public String getItemTransacao() {
		return itemTransacao;
	}

	public void setItemTransacao(String itemTransacao) {
		this.itemTransacao = itemTransacao;
	}

	public Long getIdJogo() {
		return idJogo;
	}

	public void setIdJogo(Long idJogo) {
		this.idJogo = idJogo;
	}

	@Override
	public String toString() {
		return "Ingresso [id=" + id + ", idUsuario=" + idUsuario + ", itemTransacao=" + itemTransacao + ", idJogo="
				+ idJogo + ", dataInicio=" + dataInicio + ", dataFim=" + dataFim + ", url=" + url + ", status=" + status
				+ ", jogo=" + jogo + "]";
	}

	

	

	
	
	
	
	

}
