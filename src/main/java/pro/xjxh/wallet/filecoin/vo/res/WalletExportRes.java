package pro.xjxh.wallet.filecoin.vo.res;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 导出钱包返回 VO
 * @author yangjian
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public final class WalletExportRes {

	@JsonProperty("KeyInfo")
	private List<KeyInfo> keyInfo;

	public List<KeyInfo> getKeyInfo() {
		return keyInfo;
	}

	public void setKeyInfo(List<KeyInfo> keyInfo) {
		this.keyInfo = keyInfo;
	}
}
