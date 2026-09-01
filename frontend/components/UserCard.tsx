import { User } from "@/types/types";

interface UserCardProps {
    user: User;
}

export default function UserCard({ user }: UserCardProps) {
    return (
        <div key={user.id} className="border rounded-lg p-4 shadow-sm">
            <h2 className="text-lg font-bold">
                {user.name}
            </h2>

            <p>{user.email}</p>
            <p>{user.cpf}</p>
        </div>
    );
}