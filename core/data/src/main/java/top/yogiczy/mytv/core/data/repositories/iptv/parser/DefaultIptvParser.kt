package top.yogiczy.mytv.core.data.repositories.iptv.parser

/**
 * 缺省订阅源解析
 */
class DefaultIptvParser : IptvParser {

    override fun isSupport(url: String, data: String): Boolean {
        return true
    }

    override suspend fun parse(data: String): List<IptvParser.ChannelItem> {
        return listOf(
            IptvParser.ChannelItem(
                groupName = "ERROR",
                name = "Unsupported Format",
                url = "http://1.2.3.4",
            ),
        )
    }
}