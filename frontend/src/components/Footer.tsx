export default function Footer(){
    return (
        <footer className="border-t border-white/10 bg-slate-950/40">
            <div className="max-w-6xl mx-auto px-4 py-10 text-sm text-white/70">
                <div className="flex flex-col md:flex-row gap-6 md:items-center md:justify-between">
                    <div className="flex items-center gap-3">
                        <div className="h-9 w-9 rounded-2xl bg-white/10 border border-white/10 flex items-center justify-center">
                            <span>🎁</span>
                        </div>
                        <div>
                            <p className="font-semibold text-white">NaviDAM</p>
                            <p className="text-xs text-white/60">@2025 DAM1 Y DAM 2</p>
                        </div>
                    </div>

                    <div className="flex flex-wrap gap-2">
                        <span className="px-3 py-1.5 rounded-full bg-white/5 border border-white/10 text-xs">#DAM</span>
                        <span className="px-3 py-1.5 rounded-full bg-white/5 border border-white/10 text-xs">#Hackathon 2025</span>
                        <span className="px-3 py-1.5 rounded-full bg-white/5 border border-white/10 text-xs">#Software</span>
                    </div>
                </div>
            </div>
        </footer>
    )
}